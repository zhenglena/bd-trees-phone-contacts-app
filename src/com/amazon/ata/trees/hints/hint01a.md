If you wanted a Comparator that sorts `Name` by first name, you can use the `Comparator::comparing` by calling
`Comparator.comparing(Name::getFirstName)`. This returns a `Comparator` that sorts by first name
that you can then pass into your `TreeMap` constructor.
