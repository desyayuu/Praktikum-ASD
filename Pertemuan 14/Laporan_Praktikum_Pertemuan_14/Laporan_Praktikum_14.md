## Laporan Praktikum Pertemuan 14 
oleh Desy Ayurianti - 1G D4 TI - 2141720119 

###SubBab 2.1.2 
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif
   dilakukan dibanding binary tree biasa?

   **Karena dalam binary search tree left-child sudah ditentukan harus lebih kecil daripada right-childnya dan parentnya sehingga apabila ada pencarian node lebih mudah. Jika lebih kecil dari yang dicari maka langsung ke arah left-child dan sebaliknya**
2. Untuk apakah di class Node, kegunaan dari atribut left dan right?

   **Untuk menunjukkan leftchild dan rightchild dari sebuah node**
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?

   **root digunakan untuk menyimpan data parent**

   b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?

   **ketika objek pertama kali dibuat, nilai root pertama kali diset null**
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa
   yang akan terjadi?
   
   **Ketika tree masih kosong, dan akan ditambahkan node baru maka node baru yang akan ditambahkan tersebut menjadi root**
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah
   ini. Jelaskan secara detil untuk apa baris program tersebut?
    ```java 
         if(data< current.data){
                    if(current.left!=null){
                        current=current.left;
                    }else{
                        current.left=new Node(data);//node baru sbg leftchild root
                        break;
                    }
   
   ```
   **Jika data yang akan ditambahkan lebih kecil dari current, maka setelah itu dicek lagi apakah ada leftchild dari current atau tidak. Jika ada leftchildnya, maka current sekarang berada di left child dari current awal. Jika tidak ada left child dari current awal, maka data yang akan dimasukkan sekarang menjadi node baru yang bertindak sebgai leftchild dari current **

###SubBab 13.1.1
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class
   BinaryTreeArray?

   **Atribut data digunakan untuk menyimpan data dalam array, sedangkan idxLast untuk menyimpan indeks terakhir dari data array**
2. Apakah kegunaan dari method populateData()?

   **Method tersebut digunakan agar bisa mengisi data dalam bentuk array dan indeks terakhir dari array**
3. Apakah kegunaan dari method traverseInOrder()?

   **Untuk mencetak penelusuran seluruh node secara inorder, yaitu dengan menecetak seluruh data pada subtree kiri dulu, setelah itu menecetak root dan cetak subtree kanan**
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks
   berapakah posisi left child dan rigth child masing-masing?
   
   **Left child= 2 x 2 + 1 = 5**
   **Right child = 2 x 2 + 2 = 6**

5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor
   4?
   **Untuk menunjukkan bahwa indeks terakhir hanya sampai di indeks ke-6**


###SubBab 13.3 
1. Menambahkan Node Secra Rekursif 
   
   Kode Program 

   <img src = "Tugas1.1">

   Kode Program Main

   <img src = "Tugas1.2">

   Output

   <img src = "Tugas1.3">

2. Menampilkan nilai paling kecil dan paling besar di tree 

   Kode Program

   <img src = "Tugas2.1">

   Kode Program Main

   <img src = "Tugas2.2">

   Output

   <img src = "Tugas2.3">

3. Menampilkan data Leaf 

   Kode Program

   <img src = "Tugas3.1">

   Kode Program Main

   <img src = "Tugas3.2">

   Output

   <img src = "Tugas3.3">

4. Menampilkan jumlah Leaf 

   Kode Program

   <img src = "Tugas4.1">

   Kode Program Main

   <img src = "Tugas4.2">

   Output

   <img src = "Tugas4.3">

5. Method add, traversePreOrder, traversePostOrder di BinaryTreeArray 

   Kode Program

   <img src = "Tugas5.1">

   Kode Program Main

   <img src = "Tugas5.2">

   Output

   <img src = "Tugas5.3">
