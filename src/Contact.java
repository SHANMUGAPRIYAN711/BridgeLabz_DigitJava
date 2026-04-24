class Contact {
    String firstName, lastName, address, city, state, zip, phone, email;

    Contact(String firstName, String lastName, String address,
            String city, String state, String zip,
            String phone, String email) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public void display() {
        System.out.println(firstName + " " + lastName + " - " + city);
    }
}