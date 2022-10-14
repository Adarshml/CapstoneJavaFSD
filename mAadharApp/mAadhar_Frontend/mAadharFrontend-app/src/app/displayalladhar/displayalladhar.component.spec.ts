import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayalladharComponent } from './displayalladhar.component';

describe('DisplayalladharComponent', () => {
  let component: DisplayalladharComponent;
  let fixture: ComponentFixture<DisplayalladharComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayalladharComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayalladharComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
