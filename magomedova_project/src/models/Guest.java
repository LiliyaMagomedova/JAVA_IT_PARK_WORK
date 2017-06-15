
public class Guest {
    private int id;
    private String name;
    private boolean isKid;

    public Guest(int id, String name, boolean isKid) {
        this.id = id;
        this.name = name;
        this.isKid = isKid;
    }

    public Guest(String name, boolean isKid) {
        this.name = name;
        this.isKid = isKid;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getIsKid() {
        return isKid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || !(object instanceof Guest)) {
            return false;
        }

        Guest that = (Guest) object;

        return this.id == that.id &&
                this.name.equals(that.name);
    }
}