# Pantau Covid
![home_page](https://user-images.githubusercontent.com/81602971/123670840-d4e5e780-d867-11eb-996f-42052bd33825.PNG)

Deskripsi
---------------------------------------------------------------------------------------
Pantau Covid adalah aplikasi Web yang menampilkan data total kasus COVID-19 di Indonesia dan kasus di negara lainnya.

Aplikasi Web ini memanfaatkan API dari https://kawalcorona.com/api dan untuk memanggil datanya ke dalam halaman web menggunakan [Spring REST Tamplate](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html) untuk memanggil API.

Demo
---------------------------------------------------------------------------------------
klik untuk melihat demo 
https://pantau-covid.herokuapp.com/

Spesifikasi
---------------------------------------------------------------------------------------
- Eclipse IDE for Enterprise Java Developers Versi 2020-06
- Java JDK 8

#### Teknologi yang digunakan
- Spring boot versi 2.4.3
- Thymeleaf (untuk template engine)
- Bootstrap 4.5

Fitur
---------------------------------------------------------------------------------------
- Menampilkan data total kasus COVID-19 di Indonesia dan kasus di negara lainnya.

Instalasi
---------------------------------------------------------------------------------------
#### Menggunakan Git
```bash
git clone https://github.com/SYHRL360/pantau-covid-id.git
```

#### Download ZIP
[download](https://github.com/SYHRL360/pantau-covid-id/archive/refs/heads/main.zip)

Setup
---------------------------------------------------------------------------------------
1. Buka Eclipse IDE
2. Pilih `File -> Import -> Maven -> Existing Maven project`
3. Klik kanan pada project dan klik `Run As -> Maven install` untuk mengenerate file.
4. Untuk menjalankan aplikasi klik kanan pada file yang memiliki main method pilih `Run As -> Java Application`
5. Buka browser lalu kunjungi http://localhost:8080

Screen Shoot
---------------------------------------------------------------------------------------
1. Data Kasus di Indonesia
![total_kasus_indonesia](https://user-images.githubusercontent.com/81602971/123671789-db289380-d868-11eb-87b0-f4af26f11169.PNG)

2. Data seluruh Provinsi
![data_provinsi](https://user-images.githubusercontent.com/81602971/123671924-014e3380-d869-11eb-998b-e7d88c74dd41.PNG)

3. Data Global
![data_global](https://user-images.githubusercontent.com/81602971/123672010-14f99a00-d869-11eb-85be-dea7d92a5414.PNG)


License
---------------------------------------------------------------------------------------
[MIT License](https://opensource.org/licenses/MIT)

