package org.github.otanikotani.ui.toolwindow;

@FunctionalInterface
public interface ChecksListener {

    void onRefresh(ChecksLocation coordinates);
}
