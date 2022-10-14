import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewadharComponent } from './viewadhar.component';

describe('ViewadharComponent', () => {
  let component: ViewadharComponent;
  let fixture: ComponentFixture<ViewadharComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewadharComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewadharComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
