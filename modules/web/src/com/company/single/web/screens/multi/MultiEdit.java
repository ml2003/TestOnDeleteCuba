package com.company.single.web.screens.multi;

import com.haulmont.cuba.gui.screen.*;
import com.company.single.entity.Multi;

@UiController("single_Multi.edit")
@UiDescriptor("multi-edit.xml")
@EditedEntityContainer("multiDc")
@LoadDataBeforeShow
public class MultiEdit extends StandardEditor<Multi> {
}