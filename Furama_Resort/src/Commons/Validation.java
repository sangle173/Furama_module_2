package Commons;

import Controllers.HouseManagement;
import Controllers.RoomManagement;
import Controllers.VillaManagement;
import Models.House;
import Models.Room;
import Models.Villa;

import java.util.List;
import java.util.regex.Pattern;

public class Validation {
    private static final String ID_VILLA_REGEX = "^SVVL-\\d{4}$";
    private static final String ID_HOUSE_REGEX = "^SVHO-\\d{4}$";
    private static final String ID_ROOM_REGEX = "^SVRO-\\d{4}$";
    private static final String TEXT_REGEX = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
    private static final String FREE_SERVICE_REGEX = "^(massage|karaoke|food|drink|car)$";
    private static final String BIRTHDAY_REGEX = "^([0-2][1-9]|[1-3]0|31)/(0[1-9]|1[0-2])/(190[1-9]|19[1-9]\\d|2\\d{3})$";
    private static final String GENDER_REGEX = "^(male|female|unknown)$";
    private static final String ID_CARD_REGEX = "^[0-9]{3}[0-9]{3}[0-9]{3}$";
    private static final String PHONE_REGEX = "^0[0-9]{9}$";
    private static final String EMAIL_REGEX = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";


    public boolean validateIdVilla(String id) {
        try {
            if (Pattern.matches(ID_VILLA_REGEX, id)) {
                List<Villa> villaList = new VillaManagement().read();
                for (Villa villa : villaList) {
                    if (villa.getServiceId().equals(id)) {
                        throw new Exception("Id service is available");
                    }
                }
                return true;
            }
            throw new Exception("Id service must be SVXX-YYYY with X is a number 0 to 9");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateIdHouse(String id) {
        try {
            if (Pattern.matches(ID_HOUSE_REGEX, id)) {
                List<Room> roomList = new RoomManagement().read();
                for (Room room : roomList) {
                    if (room.getServiceId().equals(id)) {
                        throw new Exception("Id service is available");
                    }
                }
                return true;
            }
            throw new Exception("Id service must be SVXX-YYYY with X is a number 0 to 9");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateIdRoom(String id) {
        try {
            if (Pattern.matches(ID_ROOM_REGEX, id)) {
                List<House> houseList = new HouseManagement().read();
                for (House house : houseList) {
                    if (house.getServiceId().equals(id)) {
                        throw new Exception("Id service is available");
                    }
                }
                return true;
            }
            throw new Exception("Id service must be SVXX-YYYY with X is a number 0 to 9");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateText(String text) {
        try {
            if (Pattern.matches(TEXT_REGEX, text)) {
                return true;
            }
            throw new Exception("The text must be capitalized first letter of each word");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateAreaUsingAndPool(String area) {
        try {
            if (Double.parseDouble(area) > 30) {
                return true;
            }
            throw new Exception("The value must be larger than 30");
        } catch (NumberFormatException e) {
            System.out.println("The value must be a number");
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateRentalPrice(String rentalPrice) {
        try {
            if (Double.parseDouble(rentalPrice) > 0) {
                return true;
            }
            throw new Exception("The rental price must be greater than 0");
        } catch (NumberFormatException e) {
            System.out.println("The rental price must be a number");
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateMaxOfCustomer(String maxOfCustomer) {
        try {
            int num = Integer.parseInt(maxOfCustomer);
            if (num > 0 && num < 20) {
                return true;
            }
            throw new Exception("Max of customer must be a positive integer within greater than 0 and less than 20");
        } catch (NumberFormatException e) {
            System.out.println("Max of customer must be an integer");
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateNoOfFloors(String noOfFloors) {
        try {
            int num = Integer.parseInt(noOfFloors);
            if (num > 0) {
                return true;
            }
            throw new Exception("No of floors must be a positive greater than 0");
        } catch (NumberFormatException e) {
            System.out.println("No of floors must be an integer");
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateFreeService(String freeService) {
        try {
            if (Pattern.matches(FREE_SERVICE_REGEX, freeService)) {
                return true;
            }
            throw new Exception("The free service need to be in list");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateCustomerBirthday(String customerBirthDay) {
        try {
            if (Pattern.matches(BIRTHDAY_REGEX, customerBirthDay)) {
                return true;
            }
            throw new Exception("The birthday must be dd/MM/yyyy with yyyy greater than 1900");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateCustomerGender(String customerGender) {
        try {
            if (Pattern.matches(GENDER_REGEX, customerGender)) {
                return true;
            }
            throw new Exception("The gender of customer need to be in list 'male ,female or unknown'");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateCustomerIdCard(String idCustomer) {
        try {
            if (Pattern.matches(ID_CARD_REGEX, idCustomer)) {
                return true;
            }
            throw new Exception("The id card must to be XXXXXXXXX");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateCustomerPhone(String customerPhone) {
        try {
            if (Pattern.matches(PHONE_REGEX, customerPhone)) {
                return true;
            }
            throw new Exception("The phone number must to be 0XXXXXXXXX");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean validateCustomerEmail(String customerEmail) {
        try {
            if (Pattern.matches(EMAIL_REGEX, customerEmail)) {
                return true;
            }
            throw new Exception("The email format must to be 'abc@abc.abc'");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
