package de.henny022.RiskOnline.Territories;

import java.util.List;

/**
 * Created by henny on 14.10.16.
 */
public class Continent
{
    private EContinent eContinent;
    private String name;
    private int reinforcementCount;
    private List<ETerritory> territories;

    public Continent(EContinent eContinent, String name, int reinforcementCount)
    {
        this.eContinent = eContinent;
        this.name = name;
        this.reinforcementCount = reinforcementCount;
    }

    /**
     * Returns the occupier of Continent
     *
     * @return Occupier of the Territories if they all belong to the same person
     * "Noone" otherwise
     */
    public String getOccupier()
    {
        String occupier = null;
        for(ETerritory territory : territories)
        {
            String territoryOccupier = World.getInstance().getTerritoryByEnum(territory).getOccupier();
            if(occupier == null)
            {
                occupier = territoryOccupier;
            }
            else
            {
                if(!occupier.equals(territoryOccupier))
                {
                    return "Noone";
                }
            }
        }
        return occupier;
    }

    public void addTerritory(ETerritory territory)
    {
        territories.add(territory);
    }

    public List<ETerritory> getTerritories()
    {
        return territories;
    }

    public EContinent geteContinent()
    {
        return eContinent;
    }

    public String getName()
    {
        return name;
    }

    public int getReinforcementCount()
    {
        return reinforcementCount;
    }

    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public boolean equals(Object object)
    {
        if(object.getClass().equals(Continent.class))
        {
            return ((Continent) object).eContinent == this.eContinent;
        }
        else
        {
            return false;
        }
    }
}
