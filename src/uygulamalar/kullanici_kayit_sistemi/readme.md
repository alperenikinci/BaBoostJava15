# KULLANICI KAYIT SISTEMI
## BASLANGIC : 07-17-2024
## BITIS : 07-26-2024
### 07-16-2024 Salı günü (week04/day02) kurduğumuz OzelListe yapısının yardımı ile original paketi altında Kullanıcı Kayıt Sistemi geliştirdik. Geliştirmede;
#### 1- Kalıtım ile access specifier'lar kullanıldı.
#### 2- Database mantığı OzelListe'nin sağladığı altyapı aracılığıyla kullanıldı.
#### 3- Nesneye yönelimli bir çalışma yürütülüp nesneler birbirleri ile ilişkilendirilerek kolektif bir yapı elde edildi.
#### 4- Katmanlı yapı kullanılarak arka planda yapılan işlemler CRUD metot isimlendirmeleri ile maskelendi, arkadaki kompleks yapıdan ayrıştırıldı ve daha net, basit metotlar aracılığı ile kullanıma sunuldu. Bu vesileyle UX ve Basic User Interface e atıfta bulunuldu.
#### 5- Veri işlevleri DB'den sağlanırken, verinin alınma süreci main sınıfı içerisinde yürütülerek, katmanlı mimariyi andıracak şekilde çalışıldı.

### Daha sonra proje refactor edildi ve uygulamalar/kullanici_kayit_sistemi/refactored pakedi altında yeniden oluşturuldu. Bu süreçte;
#### 1- Generic Typelar ile çalışabilmek adına OzelListe yapısı yerini ArrayList'e bıraktı.
#### 2- Entity'leri sınıflandırıp, toplu seslenişe tabi tutabilmek için BaseEntity sınıfı oluşturdu ve id buradan verildi.
#### 3- DatabaseManager isimli parent bir DB sınıfı içerisinde CRUD işlemleri <T extends Base entity> yapısı ile generic hale getirildi ve BaseEntity ailesinin ferdi olan herhangi bir alt sınıf(Entity) aracılığıyla kullanılabilir şekilde dinamikleştirildi.
#### 3.1- Bu dinamikleştirme altyapısı sonucunda DB'leri sadece extend ederek CRUD metotlarının kolay kullanımı sağlandı.
#### 4- Paket yapısında da refactoring'e giderek entityleri, utility kapsamında ele alınabilecek CRUD ve DatabaseManager sınıflarını, ileride repository yapısına evrilecek olan database sınıflarını ayrı paketlerde saklayarak daha temiz, okunur ve anlaşılır bir yapı elde ettik.
#### 5- Kurdugumuz altyapıyı uygulama üzerinde kullanmaya başladık. Bunun için KullaniciKayitSistemi sınıfında gerekli importları gerçekleştirdik ve gerekli refactoring çalışmalarını yürüttük.
#### 6- Son olarak kurduğumuz altyapının da nimetlerinden faydalanarak kullanıcıların birbirlerine mail gönderebildiği, gonderdikleri ve aldıkları mailleri görüntüleyebildikleri yeni bir mail arayüzünü de entegre edip projeyi noktaladık.
