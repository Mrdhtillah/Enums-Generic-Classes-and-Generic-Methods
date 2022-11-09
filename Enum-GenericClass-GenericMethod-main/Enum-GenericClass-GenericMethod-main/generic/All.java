
package generic;

class All<T> {
    private T Person;

    protected void setPerson(T Person) {
        this.Person = Person;
    }

    protected T getPerson() {
        return Person;
    }
}
