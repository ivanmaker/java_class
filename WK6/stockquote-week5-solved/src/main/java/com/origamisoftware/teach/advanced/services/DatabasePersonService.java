package com.origamisoftware.teach.advanced.services;

import com.origamisoftware.teach.advanced.model.Person;
import com.origamisoftware.teach.advanced.model.Quotes;
import com.origamisoftware.teach.advanced.util.DatabaseConnectionException;
import com.origamisoftware.teach.advanced.util.DatabaseUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * An implementation of the PersonService interface that gets
 * Person/Quote data from a database.
 */
class DatabasePersonService implements PersonService {

    /**accesses database to retrieve person information
     *
     * @return a new person populated with database information
     * @throws PersonServiceException
     */

    @Override
    public List<Person> getPerson() throws PersonServiceException {
        List<Person> personList = null;
        Person person = new Person();
        String firstName, lastName;
        Timestamp birthDay;

        firstName = person.getFirstName();
        lastName = person.getLastName();
        birthDay = person.getBirthDate();

        try {
            Connection connection = DatabaseUtils.getConnection();
            Statement statement = connection.createStatement();
            String queryString = "select * from person where first_name = '" + firstName + "' and last_name = '" + lastName + "'" +
                    "and birth_date = '" + birthDay + "'";

            ResultSet resultSet = statement.executeQuery(queryString);
            personList = new ArrayList<>(resultSet.getFetchSize());
            while (resultSet.next()) {
                firstName = resultSet.getString("first_name");
                lastName = resultSet.getString("last_name");
                birthDay = resultSet.getTimestamp("time");

                personList.add(new Person(firstName, lastName, birthDay));
            }

        } catch (DatabaseConnectionException | SQLException exception) {
            throw new PersonServiceException(exception.getMessage(), exception);
        }
        if (personList.isEmpty()) {
            throw new PersonServiceException("There is no person data for:" + firstName + lastName + birthDay, null);
        }
        return personList;
    }
    //seems redundant with what list<person> getPerson does? If i delete i get an error for not using all of the
    //interfaces methods, should they be left blank?
    @Override
    public void addOrUpdatePerson(Person person) throws PersonServiceException {

    }

    /**accesses database to get quote information for use with PersonQuote
     *
     * @param person
     * @return new list of quote information from the database
     * @throws PersonServiceException
     */
    @Override
    public List<Quotes> getQuotes(Person person) throws PersonServiceException {
            List<Quotes> quotesList = null;
            Quotes quotes = new Quotes();
            String symbol;
            int price = 0;
            Timestamp time;

            symbol = quotes.getSymbol();
            price = quotes.getPrice();
            time = quotes.getTime();

            try {
                Connection connection = DatabaseUtils.getConnection();
                Statement statement = connection.createStatement();
                String queryString = "select * from quotes where symbol = '" + symbol + "' and time = '" + time + "'" +
                        "and price = '" + price + "'";

                ResultSet resultSet = statement.executeQuery(queryString);
                quotesList = new ArrayList<>(resultSet.getFetchSize());
                while (resultSet.next()) {
                    symbol = resultSet.getString("symbol");
                    price = resultSet.getInt("price");
                    time = resultSet.getTimestamp("time");

                    quotesList.add(new Quotes(symbol, price, time));
                }

            } catch (DatabaseConnectionException | SQLException exception) {
                throw new PersonServiceException(exception.getMessage(), exception);
            }
            if (quotesList.isEmpty()) {
                throw new PersonServiceException("There is no stock data for:"  + symbol + price + time, null);
            }

            return quotesList;
    }
    //may not need to interact with the database? Information is aggregated in another method?
    @Override
    public void addQuotesToPerson(Quotes quotes, Person person) throws PersonServiceException {

    }
}
