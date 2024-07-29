package week06.day01.enumornekler.enumornek03;

import java.util.List;

public class Video {

    private String username;
    List<String> yorumlar;
    private EKatilTiers katilTier = EKatilTiers.TIER2;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getYorumlar() {
        return yorumlar;
    }

    public void setYorumlar(List<String> yorumlar) {
        this.yorumlar = yorumlar;
    }

    public void setKatilTier(EKatilTiers katilTier) {
        this.katilTier = katilTier;
    }

    public EKatilTiers getKatilTier() {
        return katilTier;
    }
}
