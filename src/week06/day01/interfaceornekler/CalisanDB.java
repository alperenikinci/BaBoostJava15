package week06.day01.interfaceornekler;

import java.util.ArrayList;
import java.util.List;

public class CalisanDB {
   static List<Calisan> calisanList = new ArrayList<>();


   public List<Calisan> findAll(){
       return calisanList;
   }

   public List<SahaCalismasiYapabilir> findAllThatSahaCalismasiYapabilir(){
       List<SahaCalismasiYapabilir> sahaCalismasiYapabilirList = new ArrayList<>();
       for (Calisan calisan: calisanList){
           if (calisan instanceof SahaCalismasiYapabilir){
               sahaCalismasiYapabilirList.add((SahaCalismasiYapabilir) calisan);
           }
       }
       return sahaCalismasiYapabilirList;
   }

   public List<MaasaGoreUnvanAlabilir> findAllThatUnvanDeterminedByMaas(){
       List<MaasaGoreUnvanAlabilir> maasaGoreUnvanAlanlar = new ArrayList<>();
       for (Calisan calisan: calisanList){
           if (calisan instanceof MaasaGoreUnvanAlabilir){
//               Muhendis muhendis = (Muhendis) calisan; -> yukaridaki if blogu bana bu islemi sorunsuz yapabilecegimi garanti eder.
               maasaGoreUnvanAlanlar.add((MaasaGoreUnvanAlabilir) calisan);
           }
       }
       return maasaGoreUnvanAlanlar;
       //MaasaGoreUnvanAlabilir interface'inden implemente edilen her sey donulebilir.
      // return List.of(new Muhendis("Alperen","Ikinci",30000),new OfisCalisani("Alperen","Ikinci");
   }

   public List<NonSpecificEmployees> findAllNonSpecific(){
       List<NonSpecificEmployees> nonSpecificEmployeesList = new ArrayList<>();
       for (Calisan calisan: calisanList){
//           if (!(calisan instanceof MaasaGoreUnvanAlabilir)&&!(calisan instanceof SahaCalismasiYapabilir)){
//               filteredCalisanList.add(calisan);
//           }
           if(calisan instanceof NonSpecificEmployees){
               nonSpecificEmployeesList.add((NonSpecificEmployees) calisan);
           }
       }
       return nonSpecificEmployeesList;
   }
}
