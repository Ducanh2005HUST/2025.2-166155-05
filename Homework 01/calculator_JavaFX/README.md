# Calculator JavaFX

Ứng dụng máy tính đơn giản được xây dựng bằng JavaFX với kiến trúc MVC (Model-View-Controller).

## Mô tả

Đây là một ứng dụng máy tính cơ bản cho phép người dùng thực hiện các phép toán:

- Cộng (+)
- Trừ (-)
- Nhân (\*)
- Chia (/)

## Yêu cầu hệ thống

- **Java**: JDK 11 trở lên (khuyên dùng JDK 17 hoặc cao hơn)
- **Maven**: 3.6.0 trở lên
- **JavaFX**: 21.0.2

## Cài đặt

1. **Clone hoặc tải xuống dự án**

   ```bash
   cd calculator_JavaFX
   ```

2. **Cài đặt dependencies**
   Maven sẽ tự động tải xuống dependencies khi bạn chạy lệnh build hoặc run.

## Cách chạy

### Sử dụng Maven

```bash
mvn clean javafx:run
```

### Hoặc build package rồi chạy

```bash
mvn clean package
java -jar target/calculator-javafx-1.0.jar
```

## Cấu trúc dự án

```
calculator_JavaFX/
├── src/
│   └── main/
│       ├── java/
│       │   ├── main.java              # Entry point của ứng dụng
│       │   ├── controller/
│       │   │   └── CalculatorController.java
│       │   └── model/
│       │       └── CalculatorModel.java
│       └── resources/
│           └── view/
│               └── calculator.fxml     # UI definition
├── pom.xml                             # Maven configuration
└── README.md                           # This file
```

## Kiến trúc MVC

### Model (`CalculatorModel.java`)

Chứa logic tính toán:

- `add(double a, double b)` - Cộng hai số
- `sub(double a, double b)` - Trừ hai số
- `mul(double a, double b)` - Nhân hai số
- `div(double a, double b)` - Chia hai số

### View (`calculator.fxml`)

Định nghĩa giao diện người dùng bao gồm:

- 2 TextField cho nhập giá trị A và B
- 4 nút bấm cho các phép toán
- 1 TextField hiển thị kết quả

### Controller (`CalculatorController.java`)

Xử lý các sự kiện:

- Nhận dữ liệu từ View
- Gọi các hàm tính toán từ Model
- Cập nhật kết quả lên View

## Công nghệ sử dụng

- **JavaFX**: 21.0.2 - Framework cho giao diện desktop
- **Maven**: Build tool và dependency management
- **Java**: 11+ - Ngôn ngữ lập trình

## Các dependencies chính

```xml
<!-- JavaFX Controls -->
<groupId>org.openjfx</groupId>
<artifactId>javafx-controls</artifactId>
<version>21.0.2</version>

<!-- JavaFX FXML -->
<groupId>org.openjfx</groupId>
<artifactId>javafx-fxml</artifactId>
<version>21.0.2</version>
```

## Cách sử dụng ứng dụng

1. Nhập giá trị vào trường **A**
2. Nhập giá trị vào trường **B**
3. Nhấn một trong các nút phép toán (+, -, \*, /)
4. Kết quả sẽ hiển thị trong trường **Result**

### Xử lý lỗi

- Nếu nhập giá trị không phải số: hiển thị "Invalid input"
- Nếu chia cho 0: hiển thị "Cannot divide by 0"

## Build configuration

Dự án sử dụng các Maven plugins:

- **maven-compiler-plugin**: Biên dịch Java code với target Java 11
- **javafx-maven-plugin**: Chạy ứng dụng JavaFX
- **maven-shade-plugin**: Tạo executable JAR file

## Lưu ý

- Đảm bảo bạn đã cài đặt Java và Maven đúng cách
- Nếu gặp lỗi liên quan đến JavaFX, hãy đảm bảo phiên bản JavaFX tương thích với phiên bản Java của bạn
- Dự án được tonfigured sử dụng Java 11 compiler target, nhưng có thể chạy trên Java 17+

## Tác giả

Homework 01 - Calculator Project

## License

Educational Purpose
