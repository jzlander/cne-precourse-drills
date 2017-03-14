package com.galvanize;

import java.util.ArrayList;

/**
 * Created by svcmer2-2codev on 3/13/17.
 */
public class Business implements Addressable  {

    private final String name;
    //test commit

    private final ArrayList<Address> addresses = new ArrayList<>();


    public Business(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<Address> getAddresses(){
        return addresses;
    }

    @Override
    public void addAddress(Address address){
        addresses.add(address);
    }

    public String getName() {
        return name;
    }
}
