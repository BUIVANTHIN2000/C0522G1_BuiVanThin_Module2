package bailamthemoop1.contronller;

import bailamthemoop1.sevice.ICarSevicer;
import bailamthemoop1.sevice.impl.CarSevicer;

import java.util.Scanner;

public class VehicleController {
   private ICarSevicer iCarSevicer = new CarSevicer();
 private Scanner scanner = new Scanner(System.in);
    public void menuAddVehicle() {
        do {
            System.out.println("Thêm mới phương tiện\n" +
                    "1. Thêm xe tải\n" +
                    "2. Thêm xe Ôtô\n" +
                    "3. Thêm xe máy\n" +
                    "4. Thoát");
            int chooseAddVehicle = Integer.parseInt(scanner.nextLine());
            switch (chooseAddVehicle) {
                case 1:{

                    break;
                }
                case 2: {
                    iCarSevicer.add();
                    break;
                }
                case 3:{
                    break;
                }
                case 4: {
                    return;
                }

            }
        }while (true);
    }
}
