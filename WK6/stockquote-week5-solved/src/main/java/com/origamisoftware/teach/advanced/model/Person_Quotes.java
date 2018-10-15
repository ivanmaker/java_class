package com.origamisoftware.teach.advanced.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Models a table that combines person with their quotes.
 */
@Entity
@Table(name = "person_quotes", catalog = "stocks")
public class Person_Quotes {
    private int id;
    private Person person;
    private Quotes quotes;

    /**
     * Create a Person_Quotes that needs to be initialized
     */
    public Person_Quotes() {
        // this empty constructor is required by hibernate framework

    }

    /**
     * Create a valid Person_Quotes
     *
     * @param person the person to assign the quotes to
     * @param quotes  the quotes to associate the person with
     */
    public Person_Quotes(Person person, Quotes quotes) {
        setQuotes(quotes);
        setPerson(person);
    }

    /**
     * Primary Key - Unique ID for a particular row in the person_hobby table.
     *
     * @return an integer value
     */
    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    /**
     * Set the unique ID for a particular row in the person_hobby table.
     * This method should not be called by client code. The value is managed in internally.
     *
     * @param id a unique value.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return get the Person associated with this hobby
     */
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "ID", nullable = false)
    public Person getPerson() {
        return person;
    }

    /**
     * Specify the Person associated with the hobby.
     *
     * @param person a person instance
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    /**
     *
     * @return get the quotes associated with this Person
     */
    @ManyToOne
    @JoinColumn(name = "quotes_id", referencedColumnName = "ID", nullable = false)
    public Quotes getQuotes() {
        return quotes;
    }

    /**
     * Specify the quotes associated with the Person.
     *
     * @param quotes a person instance
     */
    public void setQuotes(Quotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person_Quotes that = (Person_Quotes) o;

        if (id != that.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + person.hashCode();
        result = 31 * result + quotes.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person_Quotes{" +
                "id=" + id +
                ", person=" + person +
                ", quotes=" + quotes +
                '}';
    }
}

