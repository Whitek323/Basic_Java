public class Contact {

    public String firstName , LastName, phoneNumber;

    public Contact(){

    }
    public Contact(String firstName, String lastName, String phoneNumber) {
        Utils util = new Utils();
        this.firstName = util.capitalzedFirstCharOfString(firstName);
        this.LastName = util.capitalzedFirstCharOfString(lastName);
        // \\D -> non numeric character
        this.phoneNumber = phoneNumber.replaceAll("[\\D]","");

    }


    protected String prettyFormatPhoneNumber(){
        return phoneNumber.length()==9
                ?phoneNumber.replaceAll("(\\d{3})(\\d{3})(\\d{3})","$1-$2-$3")
                :phoneNumber.length()==10
                ?phoneNumber.replaceAll("(\\d{3})(\\d{3})(\\d{4})","$1-$2-$3")
                :"error";
    }
    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", phoneNumber='" + prettyFormatPhoneNumber() + '\'' +
                '}';
    }
}
