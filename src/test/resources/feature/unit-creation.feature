Feature: Unit creation through UnitFactory and UnitTemplates
  As an user of this application
  I want to be able to create a baseUnit using only UnitFactory
  and the value supplied to this factory should be easy and short

  Scenario Outline: Create BaseUnit using the UnitFactory and UnitTemplates
    Given UnitTemplate was provided to the process: <template>
    When the value is provided to the UnitFactory
    Then Base unit should be created
    And it's values match those of the template
    Examples:
      | template          |  |
      | Zombie            |  |
      | FragileSkeleton   |  |
      | WeakSkeleton      |  |
      | Skeleton          |  |
      | StrongSkeleton    |  |
      | DangerousSkeleton |  |
      | Lich              |  |
      | WhiteRabbit       |  |
      | Cow               |  |
      | WhiteRabbit       |  |
      | Wolf              |  |