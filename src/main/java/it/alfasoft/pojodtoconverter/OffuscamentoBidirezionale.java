package it.alfasoft.pojodtoconverter;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class OffuscamentoBidirezionale {
    //OFFUSCAMENTO BIDIREZIONALE - CIFRA
    public static String cifraId(int id, String chiave) throws Exception {
        SecretKey secretKey = new SecretKeySpec(chiave.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        byte[] encryptedBytes = cipher.doFinal(String.valueOf(id).getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    //OFFUSCAMENTO BIDIREZIONALE - DECIFRA
    public static int decifraId(String idCifrato, String chiave) throws Exception {
        SecretKey secretKey = new SecretKeySpec(chiave.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] decodedBytes = Base64.getDecoder().decode(idCifrato);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        String decryptedString = new String(decryptedBytes);

        return Integer.parseInt(decryptedString);
    }
}
