package de.henny022.RiskOnline.Territories;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by henny on 24.09.16.
 */
public class World
{
    private List<Continent> continents;

    private static World ourInstance = new World();

    public static World getInstance()
    {
        return ourInstance;
    }

    private World()
    {
        continents = new ArrayList<>(6);
    }
}
