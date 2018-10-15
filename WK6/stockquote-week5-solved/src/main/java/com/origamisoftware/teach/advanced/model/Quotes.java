package com.origamisoftware.teach.advanced.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Models the quotes table
 */
@Entity
@Table(name="quotes")
public class Quotes {

    private int id;
    private String symbol;
    private Timestamp time;
    private int price;

    public Quotes(String symbol, int price, Timestamp time) {
    }
    public Quotes(){}
    /**
     * Primary Key - Unique ID for a particular row in the quotes table.
     *
     * @return an integer value
     */
    @Id
    @Column(name = "ID", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    /**
     * Set the unique ID for a particular row in the quotes table.
     * This method should not be called by client code. The value is managed in internally.
     *
     * @param id a unique value.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the symbol column as a String
     */
    @Basic
    @Column(name = "symbol", nullable = false, insertable = true, updatable = true, length = 256)
    public String getSymbol() {
        return symbol;
    }

    /**
     * Specify the stocks symbol
     *
     * @param name a String value
     */
    public void setSymbol(String name) {
        this.symbol = name;
    }

    @Basic
    @Column(name = "time", nullable = false, insertable = true, updatable = true)
    public Timestamp getTime() {
        return time;
    }

    /**
     * Specify the stocks date range.
     * @param time  the time the person was born.
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }

    /**
     * The price for the stock, an int value
     * @return the value of the price column as an int value
     */
    @Basic
    @Column(name = "price", nullable = false, insertable = true, updatable = true)
    public int getPrice() {
        return price;
    }

    /**
     * Specify the recommended $ amount for the price
     * @param price  an int value
     */
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quotes quotes = (Quotes) o;

        if (id != quotes.id) return false;
        if (time != null ? !time.equals(quotes.time) : quotes.time != null)
            return false;
        if (symbol != null ? !symbol.equals(quotes.symbol) : quotes.symbol != null)
            return false;
        if (price != quotes.price) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (symbol != null ? symbol.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", time='" + time + '\'' +
                ", price=" + price +
                '}';
    }
}
