package collection_framework.arraylist;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();


        // .add ile listeye eleman ekleriz.
        studentList.add(new Student(5, "Mehmet Can Karahan"));
        studentList.add(new Student(2, "Alperen Ikinci"));
        studentList.add(new Student(1, "Harun Sakin"));
        studentList.add(new Student(7, "Mehmet Ertop"));
        studentList.add(new Student(9, "Alex Joseph Walker"));
        studentList.add(new Student(10, "Emirhan Ergun"));

        // butun listeyi doğrudan yazdirabiliriz...
        System.out.println(studentList);
        System.out.println("\n############################\n");
        // forEach ile liste elemanlarini teker teker yazdirma.
        System.out.println("Foreach ile liste elemanlarini teker teker yazdirma (Terminal Function)");
        studentList.forEach(System.out::println);

        System.out.println("\n############################\n");
        // forEach ile liste elemanlarini teker teker yazdirma.
        System.out.println("Foreach ile liste elemanlarini teker teker yazdirma");

        for (Student student : studentList) {
            System.out.println(student);
        }

        System.out.println("\n############################\n");
        System.out.println(".get ile belirli indexteki bir ogrenciyi getirebilirim.");
        System.out.println(studentList.get(3));

        System.out.println("\n############################\n");
        System.out.println(".size ile liste boyutunu ogrenebilirim.");
        System.out.println(studentList.size());

        System.out.println("\n############################\n");
        System.out.println(".set ile indexini bildiğim bir ogrencinin bilgilerini degistirebilirim");
        System.out.println(studentList.set(3, new Student(studentList.get(3).getStudentNo(), "Mehmet Tufan")));
        System.out.println(studentList.get(3));

        System.out.println("\n############################\n");
        System.out.println(".isEmpty() ile listenin bos olup olmadigina bakabiliriz.");
        System.out.println(studentList.isEmpty());

        System.out.println("\n############################\n");
        System.out.println(".addAll ile listeye baska bir listeyi ekleyebiliriz.");
        studentList.addAll(List.of(new Student(13, "Mehmet Ertop"), new Student(17, "Emine Karabolat")));
        studentList.forEach(System.out::println);

        System.out.println("\n############################\n");
        System.out.println(".contains() ile listede bir elemanin varligini sorgulayabiliriz.");
        System.out.println(studentList.contains(new Student(17, "Emine Karabolat")));
        // false doner cunku new Student oldugu icin refersansi farkli
        Student student = studentList.get(studentList.size() - 1);
        System.out.println(studentList.contains(student));
        student.setStudentName(student.getStudentName().toUpperCase());
        System.out.println(studentList.get(studentList.size() - 1));

//        List<Integer> sayiList = List.of(1,2,3,4,5,6,7);
//        System.out.println(sayiList.contains(1));

        System.out.println("\n############################\n");
        System.out.println("Orjinal Liste : ");
        studentList.forEach(System.out::println);
        System.out.println("Alt Liste : subList() ile listenin belirli indeksler araligindaki degerleri ile alt kirilim bir liste elde edebilirim." +
                "ilk index dahil edilir, son index dahil edilmez.");
        studentList.subList(3,studentList.size()).forEach(System.out::println);
        System.out.println("Orjinal listeyi bozmaz.");
        System.out.println("\n############################\n");
        System.out.println("Listeyi bir diziye donusturme : toArray()");
//        Student[] studentArr = studentList.toArray(new Student[0]);
//        for (Student student1 : studentArr ){
//            System.out.println(student1);
//        }
        System.out.println(Arrays.toString(studentList.toArray(new Student[0])));

        System.out.println("\n############################\n");
        System.out.println("Orjinal Liste : ");
        studentList.forEach(System.out::println);
        System.out.println();
        System.out.println("Reversed Liste : Collections.reverse(studentList)");
        Collections.reverse(studentList); // Direkt olarak listeyi degistirir, yeni bir liste vs olusturmuyor
        studentList.forEach(System.out::println);
        System.out.println();
        System.out.println("Tekrar reverse yaparak listeyi orjinal haline getirdik...");
        Collections.reverse(studentList);
        studentList.forEach(System.out::println);

        System.out.println("\n############################\n");
        System.out.println("Collections.sort(studentList,(o1, o2) -> o1.getStudentName().compareTo(o2.getStudentName())) -> Ogrencileri isimlerine gore siraladik. ");
//        Collections.sort(studentList, Comparator.comparing(Student::getStudentName));
        Collections.sort(studentList,(o1, o2) -> o1.getStudentName().compareTo(o2.getStudentName()));
        studentList.forEach(System.out::println);

//        List<Integer> integerList = new ArrayList<>(List.of(3, 5, 1, -5, -16, 0));
////        List<Integer> integerList = List.of(3, 5, 1, -5, -16, 0);
//        Collections.sort(integerList); // natural order
//        System.out.println(integerList);

        System.out.println("\n############################\n");
        System.out.println(" Collections.sort(studentList, Comparator.comparing(Student::getStudentNo)) -> Ogrencileri numaralarina gore siraladik. ");
        Collections.sort(studentList, Comparator.comparing(Student::getStudentNo));
        studentList.forEach(System.out::println);

        System.out.println("\n############################\n");
        System.out.println("indexOf(student) ile belli bir ogrencinin liste index konumunu bulma...");
        System.out.println(studentList.get(studentList.indexOf(student)));

    }
}
