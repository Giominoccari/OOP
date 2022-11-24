/**
 * 
 */
package it.unibo.collections.social.impl;

import it.unibo.collections.social.api.SocialNetworkUser;
import it.unibo.collections.social.api.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * This will be an implementation of
 * {@link SocialNetworkUser}:
 * 1) complete the definition of the methods by following the suggestions
 * included in the comments below.
 * 
 * @param <U>
 *            Specific {@link User} type
 */
public final class SocialNetworkUserImpl<U extends User> extends UserImpl implements SocialNetworkUser<U> {

    /*
     *
     * [FIELDS]
     *
     * Define any necessary field
     *
     * In order to save the people followed by a user organized in groups, adopt
     * a generic-type Map:  think of what type of keys and values would best suit the requirements
     */
    final Map <String, Map> friends;

    /*
     * [CONSTRUCTORS]
     *
     * 1) Complete the definition of the constructor below, for building a user
     * participating in a social network, with 4 parameters, initializing:
     *
     * - firstName
     * - lastName
     * - username
     * - age and every other necessary field
     */

    public SocialNetworkUserImpl(final String firstName, final String lastName, final String username, final int age, final Map friends){
        super(firstName, lastName, username, age);
        this.friends = friends;
    }

    /**
     * Builds a user participating in a social network.
     *
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param userAge
     *            user's age
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */

    public SocialNetworkUserImpl(final String firstName, final String lastName, final String username, final int age){
        super(firstName, lastName, username, age);
        this.friends = new HashMap<>();
    }

    /*
     * 2) Define a further constructor where the age defaults to -1
     */

    public SocialNetworkUserImpl(final String firstName, final String lastName, final String username){
        super(firstName, lastName, username);
        this.friends = new HashMap<>();
    }

    /*
     * [METHODS]
     *
     * Implements the methods below
     */
    @Override
    public boolean addFollowedUser(final String circle, final U user) {
        for(final String element: this.friends.keySet()){
            if(circle == element){
                final Map<String, User> group;  
                group = this.friends.get(element);
                for(final String username: group.keySet()){
                    if(user.getUsername() == username){
                        System.out.println("gia presente\n");
                        return false;
                    }
                    group.put(user.getUsername(), user);
                }
                this.friends.put(element, group);
                return true;
            }
        }
        final Map<String, User> group = new HashMap<>();
        group.put(user.getUsername(), user);
        this.friends.put(circle, group);
        return true;
    }

    /**
     *
     * [NOTE] If no group with groupName exists yet, this implementation must
     * return an empty Collection.
     */
    @Override
    public Collection<U> getFollowedUsersInGroup(final String groupName) {
        Collection<U> set = new HashSet<>();
        for(final String element: friends.keySet()){
            if(groupName == element){
                final Map<String, U> group;  
                group = this.friends.get(element);
                for(final String username: group.keySet()){
                    set.add(group.get(username));
                }
            }
        }
        return set;
    }

    @Override
    public List<U> getFollowedUsers() {
        List<U> set = new ArrayList<>();
        for(final String element: this.friends.keySet()){
            set.addAll(this.getFollowedUsersInGroup(element));
        }
        return set;
    }
}
