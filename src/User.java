public class User {
    private String username;
    private int dateOfBirth;
    private String city;

    public User(String username, int dateOfBirth, String city) {
        this.username = username;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
    }

    public String getUsername() {
        return username;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        User user = (User) obj;

        return username.equals(user.username);
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }
}
