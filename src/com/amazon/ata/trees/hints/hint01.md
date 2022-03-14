As you saw in the pre-work, you can create a `TreeMap` that takes in a `Comparator` in its constructor and is used to 
sort the map based on its keys. If you want to use `Name` as the key for your `TreeMap`s, you'd need to create a 
`Comparator` for `Name` that sorts by last name and one that sorts by first name.

However, you don't have to create a `Comparator` from scratch for this! Take a look at [Comparator::comparing](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#comparing-java.util.function.Function-).
It accepts a `Function` that maps an object to a `Comparable` sort key (like `String`) and returns
a `Comparator` that  compares by that key. You can then use that `Comparator` when creating your `TreeMap`s.

[Still confused?](./hints/hint01a.md)
