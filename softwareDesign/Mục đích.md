# Mục lục:
Mục đích của tool này
Tính năng/Road map
Mục đích làm tool này

# Mục đích của tool này
So sánh 2 file Excel (thường là 2 phiên bản của cùng một tài liệu) để biết những chỗ nào khác nhau (được update).
Sử dụng tool này khi có nhiều người cùng update công việc vào một file và gửi qua lại lẫn nhau. Tool này sẽ giúp tìm ra được phần update để merge nội dung tài liệu.

# Tính năng/Road map
## Tính năng
* So sánh một số sheet chọn lọc.
* Chọn một column làm key để xác định tương quan của các row. Nếu không dùng key column thì dùng Excel row number làm key.
* Hiển thị được các phần khác nhau: Số dòng, cột, khác nhau thế nào (nội dung, format...)

## Road map
+ So sánh một sheet đầu tiên của mỗi file, dùng Excel Row number làm key.
+ Chọn lọc một số sheet để so sánh. Chọn key column.
+ Chọn option để so sánh cell: content, format, font...
+ Nhớ setting của main file.
+ I18n.
+ Visualize kết quả.

# Mục đích làm tool này
* Tạo một tool hỗ trợ tìm chỗ khác nhau sử dụng trong quá trình QA với khách hàng, đồng nghiệp thông qua Excel file.
* Làm quen với Apache POI, Swing với Eclipse, tập auto test.