package de.henny022.RiskOnline.Territories;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by henny on 14.10.16.
 */
public class World
{
    private static World instance = new World();
    private Map<EContinent, Continent> continents = new HashMap<>();
    private Map<ETerritory, Territory> territories = new HashMap<>();

    private World()
    {
        continents.put(EContinent.NORTH_AMERICA, new Continent(EContinent.NORTH_AMERICA, "North America", 5));
    }

    public static World getInstance()
    {
        return instance;
    }

    /**
     * Used to convert a EContinent to a Continent
     *
     * @param eContinent
     * @return the Continent Object matching the Enum
     */
    public Continent getContinentByEnum(EContinent eContinent)
    {
        return continents.get(eContinent);
    }

    /**
     * Used to convert a ETerritory to a Territory
     *
     * @param eTerritory
     * @return the Territory Object matching the Enum
     */
    public Continent getTerritoryByEnum(ETerritory eTerritory)
    {
        return continents.get(eTerritory);
    }

    public Map<EContinent, Continent> getContinents()
    {
        return continents;
    }

    public Map<ETerritory, Territory> getTerritories()
    {
        return territories;
    }
}
