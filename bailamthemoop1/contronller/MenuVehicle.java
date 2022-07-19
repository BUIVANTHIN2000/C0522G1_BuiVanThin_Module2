package bailamthemoop1.contronller;


import java.util.Scanner;

public class MenuVehicle {
    public static void menuVehicle() {
        CarController carController = new CarController();
        TructController tructController = new TructController();
        MotocycleController motocycleController = new MotocycleController();
        VehicleController vehicleController = new VehicleController();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn chức năng\n" +
                    "1. Thêm mới phương tiện\n" +
                    "2. Hiển thị phương tiện\n" +
                    "3. Xoá phương tiện\n" +
                    "4. Tìm kiếm theo biểm kiểm soát\n" +
                    "5. Thoát");
            System.out.print("Mời bạn nhập lựa  chọn: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1: {
                    vehicleController.menuAddVehicle();
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    break;
                }
                case 4: {
                    break;
                }
                case 5: {
                    System.exit(1);
                }
            }
        } while (true);
    }
}
