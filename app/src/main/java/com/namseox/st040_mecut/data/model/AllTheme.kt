package com.namseox.st040_mecut.data.model

enum class AllTheme(val themeName: String) {
   Null("Nulll") {
            fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
            override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
                val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
                arrayList.add(MaskBitmap3D.EFFECT.Whole3D_BT)
                arrayList.add(MaskBitmap3D.EFFECT.Whole3D_TB)
                arrayList.add(MaskBitmap3D.EFFECT.Whole3D_LR)
                arrayList.add(MaskBitmap3D.EFFECT.Whole3D_RL)
                arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_BT)
                arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_TB)
                arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_LR)
                arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_RL)
                arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_BT)
                arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_TB)
                arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_LR)
                arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_RL)
                arrayList.add(MaskBitmap3D.EFFECT.Jalousie_BT)
                arrayList.add(MaskBitmap3D.EFFECT.Jalousie_LR)
                arrayList.add(MaskBitmap3D.EFFECT.Roll2D_BT)
                arrayList.add(MaskBitmap3D.EFFECT.Roll2D_TB)
                arrayList.add(MaskBitmap3D.EFFECT.Roll2D_LR)
                arrayList.add(MaskBitmap3D.EFFECT.Roll2D_RL)
                return arrayList
            }
    },
    Crossfade("Crossfade") {
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Crossfade)
            arrayList.add(MaskBitmap3D.EFFECT.filter_color)
            arrayList.add(MaskBitmap3D.EFFECT.Dip_to_Rani)
            return arrayList
        }
    },
    Erase_Slide("Erase_Slide"){
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Erase_Slide)
            arrayList.add(MaskBitmap3D.EFFECT.Erase)
            return arrayList
        }
    },
    Curved_down("Curved_down"){
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Curved_down)
            arrayList.add(MaskBitmap3D.EFFECT.Tilt_Drift)
            return arrayList
        }
    },
    Shine("Shine") {
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Whole3D_BT)
            arrayList.add(MaskBitmap3D.EFFECT.Whole3D_TB)
            arrayList.add(MaskBitmap3D.EFFECT.Whole3D_LR)
            arrayList.add(MaskBitmap3D.EFFECT.Whole3D_RL)
            arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_BT)
            arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_TB)
            arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_LR)
            arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_RL)
            arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_BT)
            arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_TB)
            arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_LR)
            arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_RL)
            arrayList.add(MaskBitmap3D.EFFECT.Jalousie_BT)
            arrayList.add(MaskBitmap3D.EFFECT.Jalousie_LR)
            arrayList.add(MaskBitmap3D.EFFECT.Roll2D_BT)
            arrayList.add(MaskBitmap3D.EFFECT.Roll2D_TB)
            arrayList.add(MaskBitmap3D.EFFECT.Roll2D_LR)
            arrayList.add(MaskBitmap3D.EFFECT.Roll2D_RL)
            return arrayList
        }
    },
    Cross_Merge("Cross_Merge"){
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Cross_Merge)
            return arrayList
        }
    },
    Pixel_effect("Pixel_effect"){
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Pixel_effect)
            return arrayList
        }
    },
    Cross_Shutter_1("Cross_Shutter_1"){
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Cross_Shutter_1)
            return arrayList
        }
    },
    Row_Split("Row_Split"){
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Row_Split)
            arrayList.add(MaskBitmap3D.EFFECT.Col_Split)
            return arrayList
        }
    },
    Flip_Page_Right("Flip_Page_Right"){
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Flip_Page_Right)
            return arrayList
        }
    },
    Jalousie_Down_Up("Jalousie Down Up"){
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Jalousie_BT)
            arrayList.add(MaskBitmap3D.EFFECT.Jalousie_LR)
            return arrayList
        }
    },
    Whole3D_Down_Up("Whole3D Down Up"){
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Whole3D_BT)
            arrayList.add(MaskBitmap3D.EFFECT.Whole3D_TB)
            arrayList.add(MaskBitmap3D.EFFECT.Whole3D_LR)
            arrayList.add(MaskBitmap3D.EFFECT.Whole3D_RL)
            return arrayList
        }
    },
    SepartConbine_Down_Up("SepartConbine Down Up"){
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_BT)
            arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_TB)
            arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_LR)
            arrayList.add(MaskBitmap3D.EFFECT.SepartConbine_RL)
            return arrayList
        }
    },
    RollInTurn_Down_Up("RollInTurn Down Up"){
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_BT)
            arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_TB)
            arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_LR)
            arrayList.add(MaskBitmap3D.EFFECT.RollInTurn_RL)
            return arrayList
        }
    },
    Roll2D_Down_Up("Roll2D Down Up") {
        fun getTheme(arrayList: ArrayList<MaskBitmap3D.EFFECT?>?): ArrayList<MaskBitmap3D.EFFECT>? { return null }
        override fun getTheme(): ArrayList<MaskBitmap3D.EFFECT?> {
            val arrayList = ArrayList<MaskBitmap3D.EFFECT?>()
            arrayList.add(MaskBitmap3D.EFFECT.Roll2D_BT)
            arrayList.add(MaskBitmap3D.EFFECT.Roll2D_TB)
            arrayList.add(MaskBitmap3D.EFFECT.Roll2D_LR)
            arrayList.add(MaskBitmap3D.EFFECT.Roll2D_RL)
            return arrayList
        }
    };

    abstract fun getTheme(): java.util.ArrayList<MaskBitmap3D.EFFECT?>?

}