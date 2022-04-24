package testAutomations;

import org.junit.Ignore;

/**
 * Created by Emre Örs
 * Date :22.04.2022
 */
@Ignore
public enum Kullanici {

    KULLANICI1("mail@gmail.com", "password"),
    KULLANICI2("saaa", "bbbb");

    private String ad;
    private String sifre;

    public String getAd() {
        return ad;
    }

    public String getSifre() {
        return sifre;
    }

    Kullanici(String ad, String sifre) {
        this.ad = ad;
        this.sifre = sifre;
    }
}