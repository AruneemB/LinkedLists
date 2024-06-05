//Necessary inputs for ArrayLists, Collections, Iterators, and LinkedLists
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//Imports JetBrains NotNull import to ensure parameters are not null
import org.jetbrains.annotations.NotNull;

public class LinkedLists
{
    //Private instance variable where the accessor methods access the LinkedList
    private final LinkedList<String> linkedList;

    public LinkedLists(LinkedList<String> linkedList)
    {
        this.linkedList = linkedList;
    }

    //Appends String parameter to the LinkedList using the .add() method
    public void append(String element)
    {
        System.out.println("Appending element " + element + " to the LinkedList: ");
        System.out.println("Before appending: " + linkedList);
        linkedList.add(element);
        System.out.println("After appending: " + linkedList);
        System.out.println();
    }

    //Appends String parameter to the index specified by the int parameter to the LinkedList using the .add() method
    public void append(String element, int index)
    {
        System.out.println("Appending element " + element + " to the LinkedList at index " + index + ": ");
        System.out.println("Before appending: " + linkedList);
        linkedList.add(index, element);
        System.out.println("After appending: " + linkedList);
        System.out.println();
    }

    //Appends String parameter to the LinkedList based on String identifier parameter using the .add(), .addFirst(), and .addLast() methods
    public void append(String element, @NotNull String identifier)
    {
        if(identifier.equalsIgnoreCase("front")) //If the identifier parameter says "front" the String is appended to the front of the LinkedList
        {
            System.out.println("Appending element " + element + " to the " + identifier + " of the LinkedList:");
            System.out.println("Before appending: " + linkedList);
            linkedList.addFirst(element);
            System.out.println("After appending: " + linkedList);
        }
        else if (identifier.equalsIgnoreCase("end")) //If the identifier parameter says "end" the String is appended to the end of the LinkedList
        {
            System.out.println("Appending element " + element + " to the " + identifier + " of the LinkedList:");
            System.out.println("Before appending: " + linkedList);
            linkedList.addLast(element);
            System.out.println("After appending: " + linkedList);
        }
        else if (identifier.equalsIgnoreCase("both")) //If the identifier parameter says "both" the String is appended to both the front and the end of the LinkedList
        {
            System.out.println("Appending element " + element + " to the front and the end of the LinkedList:");
            System.out.println("Before appending: " + linkedList);
            linkedList.addFirst(element);
            linkedList.addLast(element);
            System.out.println("After appending: " + linkedList);
        }
        else //If the identifier does not match both Strings are appended by default
        {
            this.append(element);
            this.append(identifier);
        }
        System.out.println();
    }

    //Appends String LinkedList parameter to the LinkedList using the .addAll() method
    public void append(LinkedList<String> elements)
    {
        System.out.println("Appending list " + elements + " to the LinkedList: ");
        System.out.println("Before appending: " + linkedList);
        linkedList.addAll(elements);
        System.out.println("After appending: " + linkedList);
        System.out.println();
    }

    //Appends String LinkedList parameter to the index specified by the int parameter to the LinkedList using the .addAll() method
    public void append(LinkedList<String> elements, int index)
    {
        System.out.println("Appending list " + elements + " to the LinkedList at index " + index + ": ");
        System.out.println("Before appending: " + linkedList);
        linkedList.addAll(index, elements);
        System.out.println("After appending: " + linkedList);
        System.out.println();
    }

    //Duplicates LinkedList using the .clone() method
    public void duplicate()
    {
        System.out.println("Duplicating the LinkedList: ");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Duplicated LinkedList: " + linkedList.clone());
        System.out.println();
    }

    //Iterates through and prints the contents of the LinkedList using an enhanced for loop
    public void iterate()
    {
        System.out.println("Contents of the LinkedList in order: ");
        for(String element : linkedList)
        {
            System.out.println(element);
        }
        System.out.println();
    }

    //Iterates through and prints the contents of the LinkedList starting from the index specified by the int parameter using an iterator
    public void iterate(int index)
    {
        System.out.println("Contents of the LinkedList starting from index " + index + " in order: ");
        Iterator<String> iterator = linkedList.listIterator(index);
        while(iterator.hasNext()) System.out.println(iterator.next());
        System.out.println();
    }

    //Iterates through and prints the contents of the LinkedList based on the identifier String parameter
    public void iterate(@NotNull String identifier)
    {
        if(identifier.equalsIgnoreCase("positions"))
        {
            System.out.println("Contents of the LinkedList in order with respective positions: ");
            for(int pos = 0; pos < linkedList.size(); pos++) //Additionally prints respective positions of the LinkedList using a standard for loop
            {
                System.out.println("Element at position " + pos + ": " + linkedList.get(pos));
            }
        }
        else if(identifier.equalsIgnoreCase("reverse"))
        {
            System.out.println("Contents of the LinkedList in reverse order: ");
            Iterator<String> iterator = linkedList.descendingIterator(); //Iterates through and prints the contents in reverse order using an iterator
            while(iterator.hasNext()) System.out.println(iterator.next());
            System.out.println();
        }
        else this.iterate();
    }

    //Removes element from the LinkedList based on the String parameter (specific element) using the .remove() method
    public void remove(String element)
    {
        System.out.println("Removing element " + element + " from the LinkedList: ");
        System.out.println("Before removing: " + linkedList);
        linkedList.remove(element);
        System.out.println("After removing: " + linkedList);
        System.out.println();
    }

    //Removes element from the LinkedList based on the int parameter (element's index) using the .remove() method
    public void remove(int index)
    {
        System.out.println("Removing element at index " + index + " from the LinkedList: ");
        System.out.println("Before removing: " + linkedList);
        linkedList.remove(index);
        System.out.println("After removing: " + linkedList);
        System.out.println();
    }

    //Removes first element from the LinkedList using the .removeFirst() method
    public void removeFirst()
    {
        System.out.println("Removing element " + linkedList.getFirst() + " from the front of the LinkedList: ");
        System.out.println("Before removing: " + linkedList);
        linkedList.removeFirst();
        System.out.println("After removing: " + linkedList);
        System.out.println();
    }

    //Removes last element from the LinkedList using the .removeLast() method
    public void removeLast()
    {
        System.out.println("Removing element " + linkedList.getLast() + " from the end of the LinkedList: ");
        System.out.println("Before removing: " + linkedList);
        linkedList.removeLast();
        System.out.println("After removing: " + linkedList);
        System.out.println();
    }

    //Removes first occurrence of the element corresponding to the String parameter from the LinkedList using the .removeFirstOccurrence() method
    public void removeFirstOccurrence(String element)
    {
        System.out.println("Removing first occurrence of element " + element + " from the LinkedList: ");
        System.out.println("Before removing: " + linkedList);
        linkedList.removeFirstOccurrence(element);
        System.out.println("After removing: " + linkedList);
        System.out.println();
    }

    //Removes last occurrence of the element corresponding to the String parameter from the LinkedList using the .removeLastOccurrence() method
    public void removeLastOccurrence(String element)
    {
        System.out.println("Removing last occurrence of element " + element + " from the LinkedList: ");
        System.out.println("Before removing: " + linkedList);
        linkedList.removeLastOccurrence(element);
        System.out.println("After removing: " + linkedList);
        System.out.println();
    }

    //Removes all elements from the LinkedList using the .clear() method
    public void removeAll()
    {
        System.out.println("Removing all elements from the LinkedList: ");
        System.out.println("Before removing: " + linkedList);
        linkedList.clear();
        System.out.println("After removing: " + linkedList);
        System.out.println();
    }

    //Replaces the element located at the index int parameter with the element String parameter in the LinkedList using the .set() method
    public void replace(int index, String element)
    {
        System.out.println("Replacing element " + linkedList.get(index) + " at index " + index + " with element " + element + " in the LinkedList.");
        System.out.println("Before replacing: " + linkedList);
        linkedList.set(index, element);
        System.out.println("After replacing: " + linkedList);
        System.out.println();
    }

    //Swaps the element located at the firstIndex int parameter with the element located at the secondIndex int parameter in the LinkedList
    public void swap(int firstIndex, int secondIndex)
    {
        System.out.println("Swapping elements " + linkedList.get(firstIndex) + " and " + linkedList.get(secondIndex) + " in the LinkedList: ");
        System.out.println("Before swapping: " + linkedList);
        Collections.swap(linkedList, firstIndex, secondIndex);
        System.out.println("After swapping: " + linkedList);
        System.out.println();
    }

    //Sorts the LinkedList in alphabetical order using the Collections.sort() method
    public void sort()
    {
        System.out.println("Sorting the LinkedList in alphabetical order: ");
        System.out.println("Before sorting: " + linkedList);
        Collections.sort(linkedList);
        System.out.println("After sorting: " + linkedList);
        System.out.println();
    }

    //Sorts the LinkedList in reverse alphabetical order using the Collections.reverseOrder() method
    public void reverseSort()
    {
        System.out.println("Sorting the LinkedList in reverse alphabetical order: ");
        System.out.println("Before sorting: " + linkedList);
        linkedList.sort(Collections.reverseOrder());
        System.out.println("After sorting: " + linkedList);
        System.out.println();
    }

    //Shuffles the LinkedList using the Collections.shuffle method
    public void shuffle()
    {
        System.out.println("Shuffling the LinkedList: ");
        System.out.println("Before shuffling: " + linkedList);
        Collections.shuffle(linkedList);
        System.out.println("After shuffling: " + linkedList);
        System.out.println();
    }

    //Converts the LinkedList to an ArrayList
    public void convert()
    {
        System.out.println("Converting the LinkedList to an ArrayList: ");
        System.out.println("LinkedList: " + linkedList);
        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        System.out.println("ArrayList: " + arrayList);
        System.out.println();
    }

   //Checks if the LinkedList is empty using the .isEmpty() method
   public void check()
   {
       System.out.println("Checking if LinkedList is empty or not: ");
       if(linkedList.isEmpty()) System.out.println("LinkedList is empty.");
       else System.out.println("LinkedList is not empty.");
       System.out.println();
   }

   //Checks if the element String parameter exists in the LinkedList using the .contains() method
   public void check(String element)
    {
        System.out.println("Checking if element " + element + " exists in the LinkedList: ");
        if(linkedList.contains(element)) System.out.println(element + " exists in the LinkedList.");
        else System.out.println(element + " does not exist in the LinkedList.");
        System.out.println();
    }

    //Checks if the index int parameter exists in the LinkedList, then checks if a String element exists at that index using the .size() and .get() methods
    public void check(int index)
    {
        System.out.println("Checking if element exists in the LinkedList at index " + index);
        if(index < 0 || index > linkedList.size()) System.out.println(index + " out of bounds of LinkedList.");
        else if (linkedList.get(index) == null) System.out.println("No element exists at index " + index + ".");
        else System.out.println("Element " + linkedList.get(index) + " exists at index " + index + ".");
        System.out.println();
    }

    //Checks the LinkedList with the checkToLinkedList LinkedList<String> parameter, returning a list of Strings saying "Yes" or "No" if the LinkedList contains those Strings using the .contains() method
    public void check(@NotNull LinkedList<String> checkToLinkedList)
    {
        System.out.println("Checking LinkedList " + linkedList + " to list " + checkToLinkedList);
        LinkedList<String> checkedList = new LinkedList<>();
        for(String string : checkToLinkedList) checkedList.add(linkedList.contains(string) ? "Yes" : "No");
        System.out.println("Checked lists: " + checkedList);
        System.out.println();
    }

    //Prints a variety of statistics regarding the LinkedList using various methods
    public void summary()
    {
        System.out.println("Summary of the LinkedList: ");
        System.out.println("Size: " + linkedList.size());
        System.out.println("Data type: " + linkedList.getClass());
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Middle element: " + linkedList.get((linkedList.size())/2));
        System.out.println("Last element: " + linkedList.getLast());
        //add more features
        System.out.println();
    }

    public static void main(String[] args)
    {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Orange");
        linkedList.add("Yellow");
        LinkedLists linkedLists = new LinkedLists(linkedList);

        linkedLists.append("Green");
        linkedLists.append("Blue", 3);
        linkedLists.append("Red", "front");
        linkedLists.append("Purple", "end");
        linkedLists.append("Colors", "both");
        linkedLists.summary();

        linkedLists.removeFirst();
        linkedLists.removeLast();
        linkedLists.remove(1);
        linkedLists.remove(2);
        linkedLists.remove(3);
        linkedLists.summary();

        LinkedList<String> secondaryColors = new LinkedList<>();
        secondaryColors.add("Orange");
        secondaryColors.add("Green");
        secondaryColors.add("Purple");
        linkedLists.summary();

        linkedLists.append(secondaryColors);
        linkedLists.append(secondaryColors, 0);
        linkedLists.summary();

        linkedLists.removeFirstOccurrence("Orange");
        linkedLists.removeLastOccurrence("Orange");
        linkedLists.removeFirst();
        linkedLists.removeLast();
        linkedLists.remove("Green");
        linkedLists.remove("Purple");
        linkedLists.summary();

        linkedLists.duplicate();
        linkedLists.iterate();
        linkedLists.iterate(1);
        linkedLists.iterate("reverse");
        linkedLists.iterate("positions");
        linkedLists.summary();

        linkedLists.replace(0, "Pink");
        linkedLists.swap(0, 2);
        linkedLists.summary();

        linkedLists.sort();
        linkedLists.reverseSort();
        linkedLists.shuffle();
        linkedLists.convert();
        linkedLists.summary();

        linkedLists.check(-100);
        linkedLists.check(100);
        linkedLists.check(1);
        linkedLists.check("Red");
        linkedLists.check("Orange");
        linkedLists.check("Yellow");
        linkedLists.check(secondaryColors);
        LinkedList<String> primaryColors = new LinkedList<>();
        primaryColors.add("Red");
        primaryColors.add("Yellow");
        primaryColors.add("Blue");
        linkedLists.check(primaryColors);
        LinkedList<String> clone = new LinkedList<>(linkedList);
        linkedLists.check(clone);
        linkedLists.summary();

        linkedLists.removeAll();
        linkedLists.check();
    }

}