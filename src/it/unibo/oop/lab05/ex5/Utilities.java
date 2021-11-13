package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 */
public final class Utilities {

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> united = new HashSet<>();
    	for (final X x : setA) {
    		united.add(x);
    	}
    	for (final X y : setB) {
    		united.add(y);
    	}
        return united;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> inters = new HashSet<>();
    	for(X x : setA) {
    		for(X y : setB) {
    			if(x.equals(y)) {
    				inters.add(x); //function "add" adds only non-repeated X
    			}
    		}
    	}
        return inters;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
    	Set<X> symmDiff = new HashSet<>();
    	
    	symmDiff = setUnion(setA, setB);
    	
    	Set<X> toRemove = new HashSet<>();
    	toRemove = setIntersection(setA, setB);
    	
    	for (final X z : toRemove) {
    		symmDiff.remove(z);
    	}
    	
        return symmDiff;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
    	int a = new Random().nextInt(coll.size());
    	for (X x : coll) {
    		if(a == 0) {
    			return x;
    		}
    		a--;
    	}
        return null;
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
        X x = getRandomElement(first);
        Y y = getRandomElement(second);
    	return new Pair<>(x, y);
    }
}