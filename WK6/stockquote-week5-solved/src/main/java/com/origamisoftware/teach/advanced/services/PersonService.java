package com.origamisoftware.teach.advanced.services;

import com.origamisoftware.teach.advanced.model.Quotes;
import com.origamisoftware.teach.advanced.model.Person;

import java.util.List;

/**
 *
 */
public interface PersonService {

    /**
     * Get a list of all people
     *
     * @return a list of Person instances
     * @throws PersonServiceException if a service can not read or write the requested data
     *                                    or otherwise perform the requested operation.
     */
    List<Person> getPerson() throws PersonServiceException;

    /**
     * Add a new person or update an existing Person's data
     *
     * @param person a person object to either update or create
     * @throws PersonServiceException if a service can not read or write the requested data
     *                                    or otherwise perform the requested operation.
     */
    void addOrUpdatePerson(Person person) throws PersonServiceException;

    /**
     * Get a list of all a person's quotes.
     *
     * @return a list of quote instances
     * @throws PersonServiceException if a service can not read or write the requested data
     *                                    or otherwise perform the requested operation.
     */
    List<Quotes> getQuotes(Person person) throws PersonServiceException;

    /**
     * Assign quotes to a person.
     *
     * @param quotes  The quotes to assign
     * @param person The person to assign the quotes too.
     * @throws PersonServiceException if a service can not read or write the requested data
     *                                    or otherwise perform the requested operation.
     */
    public void addQuotesToPerson(Quotes quotes, Person person) throws PersonServiceException;

}
