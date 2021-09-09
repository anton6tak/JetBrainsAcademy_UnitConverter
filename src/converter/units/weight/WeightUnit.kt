package converter.units.weight

import converter.units.Unit

abstract class WeightUnit : Unit{
    abstract val type : WeightUnitType
    abstract val weight: Double
    abstract val abbreviated: String
    abstract override val oneUnit: String
    abstract override val manyUnits: String
    abstract val toGrams: Double
    val name: String
        get() = if (weight == 1.0) oneUnit else manyUnits
}