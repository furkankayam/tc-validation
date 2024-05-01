package org.furkankayam;

import okhttp3.*;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

public class TCValidation {

    // TC Validation Method
    public static Boolean tcValidation(
            String tc,
            String firstName,
            String lastName,
            String dateOfBirth
    ) {

        int dateOfBirthInt = Integer.parseInt(dateOfBirth);
        long tcLong = Long.parseLong(tc);

        OkHttpClient client = new OkHttpClient();

        MediaType mediaType = MediaType.parse("application/soap+xml; charset=utf-8");

        RequestBody body = RequestBody.create(mediaType,
                "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                        "<soap12:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap12=\"http://www.w3.org/2003/05/soap-envelope\">\n" +
                        "  <soap12:Body>\n" +
                        "    <TCKimlikNoDogrula xmlns=\"http://tckimlik.nvi.gov.tr/WS\">\n" +
                        "      <TCKimlikNo>" + tcLong + "</TCKimlikNo>\n" +
                        "      <Ad>" + firstName + "</Ad>\n" +
                        "      <Soyad>" + lastName + "</Soyad>\n" +
                        "      <DogumYili>" + dateOfBirthInt + "</DogumYili>\n" +
                        "    </TCKimlikNoDogrula>\n" +
                        "  </soap12:Body>\n" +
                        "</soap12:Envelope>"
        );

        Request request = new Request.Builder()
                .url("https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx")
                .method("POST", body)
                .addHeader("Content-Type", "application/soap+xml; charset=utf-8")
                .build();

        String result = null;
        try {
            Response response = client.newCall(request).execute();

            String soapResponse = response.body().string();

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            Document document = factory.newDocumentBuilder().parse(new java.io.ByteArrayInputStream(soapResponse.getBytes()));

            XPath xPath = XPathFactory.newInstance().newXPath();

            result = (String) xPath.evaluate("//TCKimlikNoDogrulaResult/text()", document, XPathConstants.STRING);

        } catch (Exception e) {
            throw new TCValidationException("org.furkankayam.TCValidation Exception!");
        }

        return Boolean.parseBoolean(result);

    }

}

