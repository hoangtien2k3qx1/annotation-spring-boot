## Hibernate - Jpa in Spring Boot Annotation:

| Annotations      | Use of annotations                                                                                                                                                                                                               |
|------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| @Entity 	        | Được sử dụng để khai báo bất kỳ lớp POJO nào làm thực thể cho cơ sở dữ liệu                                                                                                                                                      |
| @Table           | Được sử dụng để thay đổi chi tiết bảng, một số thuộc tính là -name – ghi đè danh mục lược đồ tên bảng thực thi các ràng buộc duy nhất                                                                                            |
| @Id	             | Được sử dụng để khai báo khóa chính bên trong lớp POJO của chúng ta                                                                                                                                                              |
| @GeneratedValue	 | Hibernate tự động tạo các giá trị có tham chiếu đến chuỗi nội bộ và chúng ta không cần đặt giá trị theo cách thủ công.                                                                                                           |
| @Column          | Nó được sử dụng để chỉ định ánh xạ cột. Có nghĩa là nếu trong trường hợp chúng ta không cần tên cột mà chúng ta khai báo trong POJO nhưng chúng ta cần tham chiếu đến thực thể đó thì bạn có thể đổi tên cho bảng cơ sở dữ liệu. |
| @Transient	      | Yêu cầu hibernate, không thêm cột cụ thể này                                                                                                                                                                                     |
| @Temporal	       | Chú thích này được sử dụng để định dạng ngày lưu trữ trong cơ sở dữ liệu                                                                                                                                                         |
| @Lob	            | Dùng để thông báo cho chế độ hibernate rằng đó là một đối tượng lớn và không phải là một đối tượng đơn giản                                                                                                                      |
| @OrderBy         | Chú thích này sẽ thông báo hibernate cho OrderBy giống như chúng ta làm trong SQL.\nVí dụ: chúng ta cần sắp xếp theo tên học sinh theo thứ tự tăng dần                                                                           |


