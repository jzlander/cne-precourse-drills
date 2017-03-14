package com.galvanize;

import java.util.List;

/**
 * Created by svcmer2-2codev on 3/13/17.
 */
public interface Addressable {

    List<Address> getAddresses();

    void addAddress(Address address);
}
