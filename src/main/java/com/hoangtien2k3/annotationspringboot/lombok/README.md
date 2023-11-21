
# Lombok Annotations

## [@Data](): giúp giảm boilerplate code khi viết các lớp dữ liệu (data classes) trong Java
- `@Data` tự động thêm các phương thức `toString()`, `equals()`, `hashCode()`, và các phương thức `getter/setter`
```java
import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;
}
```


## [@Accessors](): giúp giảm boilerplate code khi viết các lớp dữ liệu (data classes) trong Java
- `@Accessors` không tự động thêm các phương thức như toString(), equals(), hashCode(). Thay vào đó, nó cho phép bạn tùy chỉnh cách tạo getter và setter thông qua các thuộc tính như `fluent`, `chain`, và `prefix`.

+ `Fluent (fluent = true)`: cho phép chuỗi các phương thức getter trên đối tượng mà không cần sử dụng tiền tố "get".
```java
@Accessors(fluent = true)
public class Person {
    private String name;
    private int age;
}

// Sử dụng fluent interface
Person person = new Person();
person.name("John").age(25);
```

+ `Chain (chain = true)`: các setter trả về chính đối tượng được gọi, cho phép chuỗi các phương thức setter lại với nhau.
```java
@Accessors(chain = true)
public class Person {
    private String name;
    private int age;
}

// Sử dụng chuỗi setter
Person person = new Person();
person.setName("John").setAge(25);
```

+ `Prefix (prefix = "somePrefix")`:  đặt với một giá trị, Lombok thêm một tiền tố cho tên của các getter và setter được tạo ra.
```java
@Accessors(prefix = "person")
public class Person {
    private String name;
    private int age;
}

// Sử dụng getter và setter với tiền tố "person"
Person person = new Person();
person.setPersonName("John");
String name = person.getPersonName(); 
```


## [@With](): sử dụng để tạo ra các phương thức setter không thay đổi trực tiếp trên đối tượng hiện tại mà thay vào đó trả về một bản sao của đối tượng mới với giá trị thay đổi.
+ nó gần giống vơí `protptype pattern` trong nhóm `Creational Patterns`
+ hỗ trợ việc duy trì tính không thay đổi của đối tượng (immutable object)
```java
@AllArgsConstructor
@Accessors(fluent = true)
@Data
@With
public class Person {
    private String name;
    private int age;
}

Person person1 = new Person("John", 25);
// Sử dụng phương thức withName để tạo ra một bản sao với tên mới
Person person2 = person1.withName("Alice");
// Sử dụng phương thức withAge để tạo ra một bản sao với tuổi mới
Person person3 = person1.withAge(30);
```

## [@Delegate](): sử dụng để tạo ra các phương thức từ một đối tượng khác (delegate object) và tự động thêm chúng vào lớp hiện tại. Điều này giúp giảm boilerplate code khi bạn muốn chia sẻ hoặc tái sử dụng các phương thức từ một lớp khác mà không cần thừa kế từ lớp đó.
```java
interface Engine {
    void start();
    void stop();
}

class Car {
    @Delegate(types = Engine.class)
    private final Engine engine = new CarEngine();
    
    // Các phương thức khác của lớp Car
    public void drive() {
        System.out.println("Car is driving.");
    }
}

class CarEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Engine starts.");
    }

    @Override
    public void stop() {
        System.out.println("Engine stops.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Gọi phương thức start từ Engine
        car.stop();  // Gọi phương thức stop từ Engine
        car.drive(); // Gọi phương thức drive từ Car
    }
}
```



