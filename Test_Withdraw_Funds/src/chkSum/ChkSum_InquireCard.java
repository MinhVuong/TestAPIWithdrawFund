/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chkSum;

import Encrypter.EncryptHelper;
import com.google.gson.Gson;
import data.DataInquireCard;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author CPU01661-local
 */
public class ChkSum_InquireCard {
    private String caller;
    private DataInquireCard data;
    private String secrectKey;

    public ChkSum_InquireCard() {
    }

    public ChkSum_InquireCard(String caller, DataInquireCard data, String secrectKey) {
        this.caller = caller;
        this.data = data;
        this.secrectKey = secrectKey;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public DataInquireCard getData() {
        return data;
    }

    public void setData(DataInquireCard data) {
        this.data = data;
    }

    public String getSecrectKey() {
        return secrectKey;
    }

    public void setSecrectKey(String secrectKey) {
        this.secrectKey = secrectKey;
    }
    
    public String createCheckSum() throws NoSuchAlgorithmException, UnsupportedEncodingException{
        Gson gson = new Gson();
        System.out.println("Data: " + gson.toJson(this.data));
        String rawData = this.caller + "|" + gson.toJson(this.data) + this.secrectKey;
        System.out.println("RawData: " + rawData);
        byte[] encrypt = rawData.getBytes();
        String result = EncryptHelper.SHA256(encrypt);
        return result;
    }
}
