@file:Suppress("unused")
package cc.easyandroid.filechooser.demo.demo;

import android.content.Context
import cc.easyandroid.filechooser.ChooserDialog
import cc.easyandroid.listfiltermenu.simple.R

object Demo {
    fun demo1(context: Context, startPath: String, callback: ChooserDialog.Result) {
        ChooserDialog(context)
            .titleFollowsDir(true)
            .withIcon(R.mipmap.ic_launcher)
            .withFilterRegex(false, true, ".*\\.(jpe?g|png)")
            .withStartFile(startPath)
            .withResources(R.string.title_choose_file, R.string.title_choose, R.string.dialog_cancel)
            .withChosenListener(callback)
            .withNavigateUpTo { true }
            .withNavigateTo { true }
            .build()
            .show()
    }

    fun demo2(context: Context, startPath: String, callback: ChooserDialog.Result) {
        ChooserDialog(context)
            .displayPath(true)
            .withFilter(false, true, "jpg", "jpeg", "png")
            .withStartFile(startPath)
            .enableOptions(true)
            .enableMultiple(true)
            .withResources(R.string.title_choose_file, R.string.title_choose, R.string.dialog_cancel)
            .withOptionResources(R.string.option_create_folder, R.string.options_delete, R.string.new_folder_cancel, R.string.new_folder_ok)
            .withChosenListener(callback)
            .withNavigateUpTo { true }
            .withNavigateTo { true }
            .withDateFormat("dd MMMM yyyy")
            .build()
            .show()
    }
}
