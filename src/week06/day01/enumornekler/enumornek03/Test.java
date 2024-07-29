package week06.day01.enumornekler.enumornek03;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Video video = new Video();
        video.setUsername("alperen");
        video.setYorumlar(List.of("Cok eglenceliydi","Izlerken cok guldum"));
        EKatilTiers katilTier = video.getKatilTier();
        User user;
        if(katilTier.equals(EKatilTiers.TIER0)){
            System.out.println("Herhangi bir yerden bu video izlenebilir.");
            System.out.println("Video oynatilmaya baslandi...");
        } else if(katilTier.equals(EKatilTiers.TIER1)){
            user = isUserLoggedIn();
            if(user!=null){
                user.setUserStatus(EUserStatus.TIER1);
                if (user.getUserStatus().equals(EUserStatus.TIER1) || user.getUserStatus().equals(EUserStatus.TIER2)){
                    System.out.println("Kullanici videoyu izleyebilir.");
                }
                System.out.println("Kullanici katil1 veya katil2 uyesidir ve videoyu izleyebilir.");
            }
        } else if(katilTier.equals(EKatilTiers.TIER2)){
            user = isUserLoggedIn();
            user.setUserStatus(EUserStatus.TIER2);
            if (user.getUserStatus().equals(EUserStatus.TIER2)){
                System.out.println("Kullanici videoyu izleyebilir.");
            }

            System.out.println("Kullanici katil2 uyesidir ve videoyu izleyebilir.");
        }
        }

    private static User isUserLoggedIn() {
        return new User();
    }
}
