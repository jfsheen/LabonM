package net.emole.model.literature;

import com.google.common.base.Objects;
import net.emole.model.base.BaseEntity;

import javax.persistence.Column;

/**
 * Created by sjf on 15-9-14.
 */
public class File extends BaseEntity{
    @Column
    private Literature literature;
    @Column
    private String filename;
    @Column
    private String fielExt;
    @Column
    private String path;

    public Literature getLiterature() {
        return literature;
    }

    public void setLiterature(Literature literature) {
        this.literature = literature;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFielExt() {
        return fielExt;
    }

    public void setFielExt(String fielExt) {
        this.fielExt = fielExt;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "File{" +
                "literature=" + literature +
                ", filename='" + filename + '\'' +
                ", fielExt='" + fielExt + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        File file = (File) o;
        return Objects.equal(literature, file.literature) &&
                Objects.equal(filename, file.filename) &&
                Objects.equal(fielExt, file.fielExt) &&
                Objects.equal(path, file.path);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), literature, filename, fielExt, path);
    }
}
