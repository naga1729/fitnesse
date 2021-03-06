// Copyright (C) 2003-2009 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the CPL Common Public License version 1.0.
package fitnesse.fixtures;

import fit.Fixture;
import fitnesse.wiki.fs.FileSystemPage;

public class FileSystemPageSetUp extends Fixture {

  public FileSystemPageSetUp() throws Exception {
    FitnesseFixtureContext.root = new FileSystemPage(FitnesseFixtureContext.baseDir, "RooT");
  }
}
