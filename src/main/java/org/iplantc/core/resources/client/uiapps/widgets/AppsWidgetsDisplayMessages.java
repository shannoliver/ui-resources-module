package org.iplantc.core.resources.client.uiapps.widgets;

public interface AppsWidgetsDisplayMessages {
    /**
     * @return the text to be displayed inside an empty selection item.
     */
    String emptyListSelectionText();

    String defaultGroupLabel(int grpNum);

    String emptyToolText();

    String defaultAnalysisName();

    String nonEmptyFolderWarning();

    String launchAnalysisDetailsHeadingPrefix();

    String nonDefaultFolderWarning();

    String retainInputs();

    String selectOutputFolder();

    String analysisName();

    String addGroupToolTip();

    String addArgumentToolTip();

    String checkCascadeLabel();

    String checkCascadeLabelToolTip();

    String cascadeOptionsComboToolTip();

    String forceSingleSelectLabel();

    String forceSingleSelectToolTip();

    String emptyArgumentGroupBgText();
}
