package com.studentinformation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        // 1. Student listesi oluştur
        ArrayList<Student> students = new ArrayList<>();

        // 2. Faculty oluştur
        Faculty faculty = new Faculty(
                UUID.randomUUID(),
                "MHF",
                "Mühendislik Fakültesi",
                null,
                "0322 000 00 00",
                "muhendislik@example.com",
                true,
                LocalDateTime.now()
        );

        // 3. Department oluştur
        Department department = new Department(
                UUID.randomUUID(),
                "BIL",
                "Bilgisayar Mühendisliği",
                faculty,
                null,
                "0322 000 00 01",
                "bilgisayar@example.com",
                true
        );

        // 4. Program oluştur
        Program program = new Program(
                UUID.randomUUID(),
                "BIL-LIS",
                "Bilgisayar Mühendisliği Lisans Programı",
                department,
                DegreeLevel.LISANS,
                240,
                4,
                "Turkish",
                true
        );

        // 5. Student oluştur
        Student student = new Student(
                UUID.randomUUID(),
                "20260001",
                "12345678901",
                "Poyraz",
                "Yilmaz",
                LocalDate.of(2005, 5, 15),
                Gender.MALE,
                "poyraz@example.com",
                "0555 111 22 33",
                "İzmir",
                program,
                2026,
                1,
                StudentStatus.ACTIVE,
                null,
                LocalDateTime.now()
        );

        // 6. Student'ı listeye ekle
        students.add(student);

        // 7. Registered student'ları yazdır
        System.out.println("Registered Students:");
        System.out.println("--------------------");

        for (Student registeredStudent : students) {
            System.out.println(registeredStudent);
        }
    }
}
