public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alia",17,"dauther.","In a hotel!");
        Person person2 = new Person("Altyn",17,"Mom","In a hotel!");
        Person person3 = new Person("Aizada",17,"Dad","In a hotel!");

        Person person4 = new Person("Perizat",17,"Mom","In a hostel!");
        Person person5 = new Person("Nurbek",17,"Dad","In a hostel!");
        Person person6 = new Person("Mansur",17,"Son","In a hostel!");

        Person person7 = new Person("Alibek",17,"Dad","In a flat!");
        Person person8 = new Person("Yrysgul",17,"Mom","In a flat!");
        Person person9 = new Person("Ilias",17,"Son","In a flat!");

        Person[] firstFamily = {person1, person2, person3};
        int counter1 = 0;
        for (Person person:firstFamily) {counter1++;
        }
            System.out.println("In a flat live "+counter1+" people.");


        Person[] secondFamily = {person4,person5,person6};
        int counter2 = 0;
        for (Person person:secondFamily) {counter2++;
        }
            System.out.println("In a hotel live "+counter2+" people.");


        Person[] thirdFamily = {person7,person8,person9};
        int counter3 = 0;
        for (Person person:thirdFamily) {
            counter3++;
        }
            System.out.println("In a hostel live " + counter3 + " people.");

            System.out.println();

            Flat flat = new Flat(firstFamily, 4, 2000);
            flat.payTheService();
            Hotel hotel = new Hotel(secondFamily, 7, 3, 5000);
            hotel.payTheRent();
            Hostel hostel = new Hostel(thirdFamily, 9, 2, 3000);
            hostel.payTheRent();
        }

}