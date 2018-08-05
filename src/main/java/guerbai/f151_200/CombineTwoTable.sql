SELECT Person.FirstName, Person.LastName, Address.City, Address.State
from Person LEFT OUTER JOIN Address ON Person.PersonId = Address.PersonId;
