## Phone Contacts App

### Introduction

For this activity, you'll be building a simple version of a phone contacts app, similar to what you might use on your
own phone!

The contacts app has the ability to add contacts with their name, phone number, and email address. You can view all of
your contacts sorted by their first or last name in ascending or descending order. You can also view a sublist of your
contacts based on their name -- for example, if you have lots of contacts, you can jump forward to a person in the
middle of your contacts list and view all the contacts after them.

The app has some APIs to support this functionality.

* AddContact: Saves the given contact.
* GetContacts: Retrieves all contacts in the provided sort order. If no sort parameters are given, returns the 
  default of sorting by last name in ascending order.
* ClearContacts: Removes all contacts.
* GetContactsStartingAt: Retrieves a portion of contacts starting at `Name` and includes all the contacts after the 
  given `Name`

We've also created some internal models used for creating contacts and sorting:

* `Contact`
    * `Name name`
    * `String phoneNumber`
    * `String email`
* `Name`
    * `String firstName`
    * `String lastName`
* `SortBy` (enum)
    * `FIRST_NAME`, `LAST_NAME`
* `SortOrder` (enum)
    * `ASCENDING`, `DESCENDING`

The code base follows the Activity-DAO pattern that we've come to know and love. The various Activity classes each 
implement one operation that our service supports. All activities depend on `ContactDao`'s methods to accomplish their
use cases.

*Disclaimer: One difference that you'll notice here is that our Activity classes don't yet accept/return Response/Result
objects. They're accepting/returning individual values or internal model objects. We'll keep our activities like this
until we create our service infrastructure and the necessary models. That retrofit is beyond the scope of this 
activity.*

### Phase 1: Update ContactDao to support AddContact, GetContacts, ClearContacts

The activity classes for AddContact, GetContacts, and ClearContacts have all been implemented, but we need to complete
their corresponding Dao methods to get the basic functionality of the app working! We encourage you to look at
`TreeMap`'s and `Comparator`'s Javadocs to see what methods can help provide the required functionality.

1. Instantiate `TreeMap`s `contactsSortedByFirstName` and `contactsSortedByFirstName` in `ContactDao`'s constructor
   to support sorting contacts by first name and last name.
   1. You'll need to provide a `Comparator` to the `TreeMap`s for them to know how to order the names.
2. Implement `ContactDao::getContacts` to retrieve contacts in the requested sort order
   1. You'll see that the method takes in `SortBy` and `SortOrder` enums as parameters. Make sure that the map you 
      return is sorted based on these parameters. 
    
You do NOT need to implement `ContactDao::getContactsStartingAt` yet. (That's in the next phase!)
   
Phase 1 is complete when:

- You have created `TreeMap`s in `ContactDao`'s constructor for sorting contacts by first name and last name
- You have implemented `ContactDao::getContacts` 
- `Phase0Test` and `Phase1Test` tests pass.

**Hints**
* [How can I sort by first name and last name?](src/com/amazon/ata/trees/hints/hint01.md)
* [How do I get the contacts in descending order?](src/com/amazon/ata/trees/hints/hint02.md)


### Phase 2: Implement GetContactsStartingAt

In some cases, we may want to get a subset of our contacts. For example, if you have lots of contacts, you may want to 
jump forward to a person in the middle of your contacts list and view all the contacts after them.

Implement `ContactDao::getContactsStartingAt`. Like `getContacts`, `getContactsStartingAt` accepts `SortBy` and
`SortOrder` parameters, but it also takes accepts a `Name startkey`. The method should return the portion of contacts
that includes `startKey` and all contacts that come after `startKey` in the requested sort order. 

For example, let's say you have four contacts, with names:
* Jane Doe
* Michael Smith
* Alice White
* Tom Young

(This list is sorted in `ASCENDING` order by `LAST_NAME`)

If you called `getContactsStartingAt("Alice White", SortBy.LAST_NAME, SortOrder.ASCENDING)`

The operation should return the contact information for Alice White and Tom Young, in that order.

Alternatively, say you called `getContactsStartingAt("Michael Smith", SortBy.FIRST_NAME, SortOrder.DESCENDING)`

The descending list sorted by first name looks like:
* Tom Young
* Michael Smith
* Jane Doe
* Alice White

So the operation should return the contact information for Michael Smith, Jane Doe, and Alice White, in that order.

Take a look at [TreeMap's Javadoc](https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html) to find
methods that can do what you need!

Phase 2 is complete when:
- You have implemented `ContactDao`'s `getContactsStartingAt`
- `Phase2Test` tests pass

**Hints**
* [How do I only retrieve part of a TreeMap?](src/com/amazon/ata/trees/hints/hint03.md)


### Extensions
* Add a RemoveContact operation to remove a specific contact
* Enhance the GetContactsStartingAt activity so that it returns contacts in between two provided names
* Determine the Big-O runtime complexity of each method in `ContactDao` and add that information
  to each method's javadoc.
