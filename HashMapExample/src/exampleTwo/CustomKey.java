package exampleTwo;



class CustomKey implements Cloneable{
    private final String key;

    public CustomKey(String key) {
        this.key = key;
    }

    // Override equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomKey customKey = (CustomKey) o;
        return key.equals(customKey.key);
    }

    // Override hashCode() method
    @Override
    public int hashCode() {
        return key.hashCode();
    }

    public String toString() {
        return "CustomKey{" +
                "key='" + key + '\'' +
                '}';
    }
    public CustomKey clone() {
        try {
            CustomKey customKey = (CustomKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException( e );
        }
        return new CustomKey(this.key);
    }
}
