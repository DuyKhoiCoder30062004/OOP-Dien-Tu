https://copilot.microsoft.com/shares/WC19DnJusSBEWvAB487iw
-> Suggest về làm project
12/03/2026

## Cấu hình database, bảo mật, email
# TEST CHO SPRINGBOOT NETBEANS
# DBQLKS (connection) → application.properties

# Không viết class kết nối thủ công nữa.

```
Khai báo trong src/main/resources/application.properties:

properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=HotelManagement;encrypt=true;trustServerCertificate=true;
spring.datasource.username=khoiduy
spring.datasource.password=Crazybober@321
spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
