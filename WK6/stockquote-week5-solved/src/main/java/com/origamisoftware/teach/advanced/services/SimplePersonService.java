package com.origamisoftware.teach.advanced.services;

import com.origamisoftware.teach.advanced.model.Person;
import com.origamisoftware.teach.advanced.model.Person_Quotes;
import com.origamisoftware.teach.advanced.model.Quotes;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * An implementation of the PersonService that returns hard coded data.
 */
class SimplePersonService implements PersonService {

    @Override
    public List<Person> getPerson() throws PersonServiceException {
        List<Person> personList = new ArrayList<>();
        Person_Quotes person_quotes = new Person_Quotes();

        Person person = person_quotes.getPerson();

        personList.add(person);

        return personList;
    }

    @Override
    public void addOrUpdatePerson(Person person) throws PersonServiceException {
        String firstName, lastName;
        int id;
        Timestamp birthDate;

        if (person == null)
            getPerson();
        else{
            firstName = person.getFirstName();
            person.setFirstName(firstName);

            lastName = person.getLastName();
            person.setLastName(lastName);

            id = person.getId();
            person.setId(id);

            birthDate = person.getBirthDate();
            person.setBirthDate(birthDate);}
    }

    @Override
    public List<Quotes> getQuotes(Person person) throws PersonServiceException {
        List<Quotes> quotesList = new ArrayList<>();
        Person_Quotes person_quotes = new Person_Quotes();

        Quotes quotes = person_quotes.getQuotes();

        quotesList.add(quotes);

        return quotesList;
    }

    @Override
    public void addQuotesToPerson(Quotes quotes, Person person) throws PersonServiceException {
        StringArray personQuotes = new StringArray();
        personQuotes.add(person.toString());
        personQuotes.add(quotes.toString());

    }
}
